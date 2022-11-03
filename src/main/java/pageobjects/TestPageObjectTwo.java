package pageobjects;

public class TestPageObjectTwo implements IPageObject {
    @Override
    public void testThisPageShout(){
        System.out.println(":D this is from method: \"testThisPageShout() from Class TestPageObjectTwo\"");
    }

    @Override
    public void testThisPageWhisper(){
        System.out.println(":D this is from method: \"testThisPageWhisper() from Class TestPageObjectTwo\"");
    }
}
