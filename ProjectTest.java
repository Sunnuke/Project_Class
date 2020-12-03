
class ProjectTest {

    public static void main(String[] args) {
        Project defaults = new Project();
        Project onlyName = new Project("Name Only");
        Project descriptionToo = new Project("Not Just Name", "The Project has a Name and a Description. Wow!!!");
        Project getTester = new Project("This is testing the getName Method", "This is testing the getDescription Method.");
        System.out.println("Project defaults; " + defaults.elevatorPitch());
        System.out.println("Project onlyName; " + onlyName.elevatorPitch());
        System.out.println("Project descriptionToo; " + descriptionToo.elevatorPitch());
        System.out.println("Project getTester Name: " + descriptionToo.getName());
        System.out.println("Project getTester Description: " + getTester.getDescription());
    }
}