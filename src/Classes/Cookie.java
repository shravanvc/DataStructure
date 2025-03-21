package Classes;

public class Cookie {
    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("green");
        Cookie cookie2 = new Cookie("yellow");

        cookie1.setColor("blue");

        System.out.println(cookie1.getColor());
        System.out.println(cookie2.getColor());

    }

        private String color;

    public Cookie(String color) {
            this.color = color;
        }
        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }
    }
