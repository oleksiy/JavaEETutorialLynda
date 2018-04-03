package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class FormatTag extends SimpleTagSupport {
    private String text;
    private String color;
    public int testSize;
    public boolean isUpper;

    public String getText() {
        return text;
    }

    public void setText(String message) {
        this.text = message;
    }

   public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTestSize() {
        return testSize;
    }

    public void setTestSize(int testSize) {
        this.testSize = testSize;
    }

    public boolean isUpper() {
        return isUpper;
    }

    public void setUpper(boolean upper) {
        isUpper = upper;
    }





    @Override
    public void doTag() throws JspException, IOException {
        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();
        if(text != null) {
            out.println(text);
        } else {
            out.println("Just Testing");
        }

        /***
         * if(isUpper){
         *
         */
    }
}
