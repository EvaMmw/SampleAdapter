

public class Animal {
    private String Name;
    private int ImageId;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public Animal(String name, int imageId) {
        Name = name;
        ImageId = imageId;
    }
}
