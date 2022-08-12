public class FamilyMember {
    private String name;
    private int numberOfChildren = 0;
    private FamilyMember[] children = new FamilyMember[3];

    public FamilyMember(String name) {
        this.name = name;
    }

    public boolean addChild(FamilyMember familyMember) {
        if(numberOfChildren == 3)
            return false;
        else {
            children[numberOfChildren] = familyMember;
            numberOfChildren += 1;
            return true;
        }
    }

    public static String findParent(FamilyMember root, FamilyMember member) {
        String answer = null;
        int i = 0;
        for (i = 0; i < root.numberOfChildren; i++) {
            if (root.children[i].name == member.name) {
                answer = root.name;
                return answer;
            }
            findParent(root.children[i], member);
        }
        return answer;
    }

    public static void main(String[] args){

        FamilyMember julian = new FamilyMember("Julian");

        FamilyMember liz = new FamilyMember("Liz");

        FamilyMember eileen = new FamilyMember("Eileen");

        FamilyMember karim = new FamilyMember("Karim");

        FamilyMember sana = new FamilyMember("Sana");

        FamilyMember bob = new FamilyMember("Bob");

        FamilyMember zain = new FamilyMember("Zain");

        FamilyMember zorro = new FamilyMember("Zorro");

        julian.addChild(liz);

        julian.addChild(eileen);

        liz.addChild(karim);

        liz.addChild(sana);

        liz.addChild(bob);

        eileen.addChild(zain);

        eileen.addChild(zorro);

        System.out.println(findParent(julian, zorro));

    }
}
