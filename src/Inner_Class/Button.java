package Inner_Class;

//Local class Demo
public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setOnClickListener(OnClickListener clickListener){
        this.onClickListener = clickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        void onClick(String title);
    }
}