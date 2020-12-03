import java.util.Random;

class Project {
    // Attributes
    private String name;
    private String description;

// Details
    public String elevatorPitch() {
        String name = this.name;
        if(this.description.length() > 0) {
            String description = this.description;
            return name + ": " + description;
        }
        else {
            return name + ": No description was given!";
        }
    }

    // Methods
    public Project() {
        this("Project"+((int)(Math.random() * 99999 - 10000) + 10000));
    }
    public Project(String name) {
        this.name =name;
    }
    public Project(String name, String description) {
        this.name =name;
        this.description =description;
    }

    // Project "gets" 
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}