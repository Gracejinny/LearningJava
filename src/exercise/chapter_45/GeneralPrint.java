package exercise.chapter_45;

public class GeneralPrint<B> {
    private B material;

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(B material){
        this.material = material;
    }

    public B getMaterial(){
        return this.material;
    }
}