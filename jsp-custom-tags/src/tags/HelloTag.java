package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class HelloTag extends SimpleTagSupport {
    StringWriter sw = new StringWriter();
    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (message != null) {
            // Use message from attribute, see TLD
            JspWriter out = getJspContext().getOut();
            out.println(message);
        } else {
            getJspBody().invoke(sw);
            getJspContext().getOut().println(sw.toString());
        }
    }
}
