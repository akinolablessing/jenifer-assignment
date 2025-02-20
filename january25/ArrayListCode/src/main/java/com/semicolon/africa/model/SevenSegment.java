package main.java.com.semicolon.africa.model;


    public class SevenSegment {
        private boolean[] segments;

        public SevenSegment() {
            segments = new boolean[7];
        }

        public void setDigit(int digit) {
            switch (digit) {
                case 0:
                    setSegments(true, true, true, true, true, false, true);
                    break;
                case 1:
                    setSegments(false, true, true, false, false, false, false);
                    break;
                case 2:
                    setSegments(true, true, false, true, true, true, false);
                    break;
                case 3:
                    setSegments(true, true, true, true, false, true, false);
                    break;
                case 4:
                    setSegments(false, true, true, false, false, true, true);
                    break;
                case 5:
                    setSegments(true, false, true, true, false, true, true);
                    break;
                case 6:
                    setSegments(true, false, true, true, true, true, true);
                    break;
                case 7:
                    setSegments(true, true, true, false, false, false, false);
                    break;
                case 8:
                    setSegments(true, true, true, true, true, true, true);
                    break;
                case 9:
                    setSegments(true, true, true, true, false, true, true);
                    break;
                default:
                    setSegments(false, false, false, false, false, false, false);
            }
        }

        public void setSegments(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
            segments[0] = a;
            segments[1] = b;
            segments[2] = c;
            segments[3] = d;
            segments[4] = e;
            segments[5] = f;
            segments[6] = g;
        }

        public void display() {
            System.out.println("  " + (segments[0] ? " _ " : "   "));
            System.out.println(" |" + (segments[5] ? " _ " : "   ") + "|");
            System.out.println(" |" + (segments[1] ? " _ " : "   ") + "|");
            System.out.println("  " + (segments[6] ? " _ " : "   "));
            System.out.println(" |" + (segments[2] ? " _ " : "   ") + "|");
            System.out.println(" |" + (segments[3] ? " _ " : "   ") + "|");
            System.out.println("  " + (segments[4] ? " _ " : "   "));
        }

        public static void main(String[] args) {
            SevenSegment display = new SevenSegment();
            display.setDigit(8);
            display.display();
        }
    }


