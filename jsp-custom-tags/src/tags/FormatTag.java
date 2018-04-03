package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class FormatTag extends SimpleTagSupport {
    private String text;
    private String color;
    public int fontSize;
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

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
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
        /**
        String style = "";
        if(isUpper){
            style = "style=\"text-transform: uppercase; font-size:+"+fontSize+"px; color:"+color+"\"";
        } else {
            style = "style=\"font-size:+"+fontSize+"px; color:"+color+"\"";
        }

        try {
            out.println("<p " + style + ">");
            getJspBody().invoke(out);
            out.println("</p>");
        } catch (IOException | JspException e){
            e.printStackTrace();
        }
         **/

    }
}
