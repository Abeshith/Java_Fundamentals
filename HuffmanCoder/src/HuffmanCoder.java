import java.util.*;

public class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    // Step 1: Create a node class
    public class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left, right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    // Step 2: Create a frequency map
    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> frequencymap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char ch = feeder.charAt(i);
            frequencymap.put(ch, frequencymap.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Create a min-heap to store count in ascending order
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : frequencymap.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.add(node);
        }

        // Step 4: Remove 2 elements and create a new node
        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.add(newNode);
        }

        // Step 5: Create a full tree
        Node ft = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node root, String prefix) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            encoder.put(root.data, prefix);
            decoder.put(prefix, root.data);
        }
        initEncoderDecoder(root.left, prefix + "0");
        initEncoderDecoder(root.right, prefix + "1");
    }

    public String encode(String source) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            ans.append(encoder.get(source.charAt(i)));
        }
        return ans.toString();
    }

    public String decode(String source) {
        StringBuilder ans = new StringBuilder();
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            key.append(source.charAt(i));
            if (decoder.containsKey(key.toString())) {
                ans.append(decoder.get(key.toString()));
                key.setLength(0); // Clear the key after a match is found
            }
        }
        return ans.toString();
    }
}
