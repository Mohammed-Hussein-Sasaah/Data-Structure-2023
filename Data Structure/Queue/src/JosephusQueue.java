class JosephusQueue {
    public static void main(String[] args) {
        int position = Integer.parseInt(args[0]);
        int count = Integer.parseInt(args[1]);

        printJosephusPositions(count, position);
    }

    public static void printJosephusPositions(int count, int position) {
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 0; i < count; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {

            for (int i = 1; i <= position; i++) {
                int eliminatedPosition = queue.dequeue();

                if (i == position) {
                    System.out.print(eliminatedPosition + " ");
                    break;
                }

                queue.enqueue(eliminatedPosition);
            }
        }
    }
}