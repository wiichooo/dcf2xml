/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dcf2xml;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;

/**
 *
 * @author mynor
 */

public class XmlEditorKit extends StyledEditorKit {
 
    private static final long serialVersionUID = 2969169649596107757L;
    private ViewFactory xmlViewFactory;
 
    public XmlEditorKit() {
        xmlViewFactory = (ViewFactory) new XmlViewFactory();
    }
     
    @Override
    public ViewFactory getViewFactory() {
        return xmlViewFactory;
    }
 
    @Override
    public String getContentType() {
        return "text/xml";
    }
}
