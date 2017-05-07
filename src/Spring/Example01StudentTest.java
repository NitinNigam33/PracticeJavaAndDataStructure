package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 * The Resource object represents the information of applicationContext.xml
 * file. The Resource is the interface and the ClassPathResource is the
 * implementation class of the Resource interface. The BeanFactory is
 * responsible to return the bean. The XmlBeanFactory is the implementation
 * class of the BeanFactory. There are many methods in the BeanFactory
 * interface. One method is getBean(), which returns the object of the
 * associated class.
 */
public class Example01StudentTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml"); // applicationContext.xml
        BeanFactory factory = new XmlBeanFactory(resource);

        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();
    }
}
