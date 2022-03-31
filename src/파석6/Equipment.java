package 파석6;

public class Equipment extends Item{
    int use;


    public Equipment(String name, int cost, int upGage, int use , int count) {
        super(name , cost , upGage , count);
        this.use = use;
}

    public Equipment() {
    }


}
