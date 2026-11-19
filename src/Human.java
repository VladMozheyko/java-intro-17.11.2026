public class Human {
    int head;
    int body;
    int legs;
    int arms;
    String name;

    public Human(int head, int body, int legs, int arms,String name) {
        this.head = head;
        this.body = body;
        this.legs = legs;
        this.arms = arms;
        this.name = name;
    }

    public int getHead() {
        return head;
    }

    public int getBody() {
        return body;
    }

    public int getLegs() {
        return legs;
    }

    public int getArms() {
        return arms;
    }
    public String getname() {
        return name;
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
}
