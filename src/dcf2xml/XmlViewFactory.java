/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dcf2xml;

import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

/**
 *
 * @author mynor
 */

public class XmlViewFactory extends Object implements ViewFactory {
 
    /**
     * @see javax.swing.text.ViewFactory#create(javax.swing.text.Element)
     */
    public View create(Element element) {
 
        return new XmlView(element);
    }
 
}
