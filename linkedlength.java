class nodelength {
    int data;
    nodelength next;

    nodelength() {


        data = 0;
        next = null;
    }

    nodelength(int data1) {
        data = data1;
        next = null;
    }

    nodelength(int data1, nodelength next1) {
        data = data1;
        next = next1;


    }
}


    class linkedlength {

        public static void main(String[] args) {
            nodelength head = new nodelength();
            nodelength temp = head;
            for (int i = 0; i < 5; i++) {
                temp.next = new nodelength(i);
                temp = temp.next;

            }
            int count = 0;
            nodelength current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            System.out.println("Length=" + count);
        }
    }


