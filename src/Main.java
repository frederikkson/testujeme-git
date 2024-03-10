import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;
import graphql.Assert;
import org.apache.xmlbeans.XmlException;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws XmlException, IOException, SoapUIException {

        //WsdlProject je class, project je object
        //grab the project
        WsdlProject project=new WsdlProject("C:/Users/behul/Desktop/coding/soap/projects/Udemy-Automation-soapui-project.xml");
        //grab the test suite
        WsdlTestSuite testsuite=project.getTestSuiteByName("TS_Testing");

        //grab the test cases present in test suite
        for(int i=0; i<testsuite.getTestCaseCount();i++)
        {
            WsdlTestCase testCase=testsuite.getTestCaseAt(i);

            //run the testcase qwer
            TestRunner runner=testCase.run(new PropertiesMap(), false);
            assert(runner);

        }

    }
}