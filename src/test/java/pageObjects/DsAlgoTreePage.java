package pageObjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Loggerload;

public class DsAlgoTreePage {
	private WebDriver driver;
	private Actions action ;
	public WebDriverWait wait;
	
	@FindBy(xpath="//h5[text()='Tree']/..//a[text()='Get Started']") public WebElement getStartedTreePane;
	@FindBy(xpath="//div//h4[text()='Tree']")public WebElement treePage;
	@FindBy(xpath="//a[@href='overview-of-trees']")public WebElement overview;
	
	@FindBy(linkText="Terminologies")public WebElement terminologies;
	@FindBy(linkText="Types of Trees")public WebElement typesoftrees;
	@FindBy(linkText="Tree Traversals")public WebElement treetraversals;
	@FindBy(linkText="Traversals-Illustration")public WebElement traversalsIllustration;
	@FindBy(linkText="Binary Trees")public WebElement binaryTrees;
	@FindBy(linkText="Types of Binary Trees")public WebElement typesofBT;
	@FindBy(linkText="Implementation in Python")public WebElement ImpinPython;
	@FindBy(linkText="Binary Tree Traversals")public WebElement bTreeTraversals;
	@FindBy(linkText="Implementation of Binary Trees")public WebElement impofBinaryTrees;
	@FindBy(linkText="Applications of Binary trees")public WebElement appofBinarytrees;
	@FindBy(linkText="Binary Search Trees")public WebElement binarySearchTrees;
	@FindBy(xpath="//a[text()='Implementation Of BST']")public WebElement impOfBST;
	
	@FindBy(xpath="//strong//p[text()='Overview of Trees']")public WebElement overviewTitle;
	@FindBy(xpath="//div//p[text()='Terminologies']")public WebElement terminologiesTitle;
	@FindBy(xpath="//strong//p[text()='Types of Trees']")public WebElement typesoftreesTitle;
	@FindBy(xpath="//strong//p[text()='Tree Traversals']")public WebElement treetraversalsTitle;
	@FindBy(xpath="//strong//p[text()='Traversals-Illustration']")public WebElement traversalsIllusTitle;
	@FindBy(xpath="//strong//p[text()='Binary Trees']")public WebElement binaryTreesTitle;
	@FindBy(xpath="//strong//p[text()='Types of Binary Trees']")public WebElement typesofBTTitle;
	@FindBy(xpath="//strong//p[text()='Implementation in Python']")public WebElement ImpinPythonTitle;
	@FindBy(xpath="//strong//p[text()='Binary Tree Traversals']")public WebElement bTreeTraversalsTitle;
	@FindBy(xpath="//strong//p[text()='Implementation of Binary Trees']")public WebElement impofBinaryTreesTitle;
	@FindBy(xpath="//strong//p[text()='Applications of Binary trees']")public WebElement appofBinarytreesTitle;
	@FindBy(xpath="//strong//p[text()='Binary Search Trees']")public WebElement binarySearchTreesTitle;
	@FindBy(xpath="//p[text()='Implementation Of BST']")public WebElement impOfBSTTitle;

	
	@FindBy(linkText="Try here>>>")public WebElement tryhere;
	@FindBy(xpath="//div[@class='input']")public WebElement tryEditor;
	@FindBy(xpath="//div//button[text()='Run']")public WebElement runcode;
	@FindBy(xpath="//div//pre[@id='output']")public WebElement output;
	
	@FindBy(xpath="//a[text()='Practice Questions']")public WebElement practiceQuesLink;
	@FindBy(xpath="/html/body") public WebElement practiceQuestion_page;
	
	
public DsAlgoTreePage(WebDriver driver){
		
        PageFactory.initElements(driver, this);
        this.action=new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


public void clickonGetStartedTreePane() {
      
	getStartedTreePane.click();
}


public void clickontreelinks(String string){
    
	
		if ("Overview of Trees".equals(string)) {
			overview.click();
		} else if ("Terminologies".equals(string)) {
			terminologies.click();
		} else if ("Types of Trees".equals(string)) {
			typesoftrees.click();
		} else if ("Tree Traversals".equals(string)) {
			treetraversals.click();
		} else if ("Traversals-Illustration".equals(string)) {
			traversalsIllustration.click();
		} else if ("Binary Trees".equals(string)) {
			binaryTrees.click();	
		} else if ("Types of Binary Trees".equals(string)) {
			typesofBT.click();
		} else if ("Implementation in Python".equals(string)) {
			ImpinPython.click();	
		} else if ("Binary Tree Traversals".equals(string)) {
			bTreeTraversals.click();	
		} else if ("Implementation of Binary Trees".equals(string)) {
			impofBinaryTrees.click();	
		} else if ("Applications of Binary trees".equals(string)) {
			appofBinarytrees.click();
        }else if ("Binary Search Trees".equals(string)) {
        	binarySearchTrees.click();
 		} else {
			impOfBST.click();
		}
	}
public void treelinktextdisplay(String string)
{
	if ("Overview of Trees".equals(string)) {
	    String value=overviewTitle.getText();
	    assertEquals(value,string);
	    Loggerload.info(value);
	   
	} else if ("Terminologies".equals(string)) {
		 String value=terminologiesTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	} else if ("Types of Trees".equals(string)) {
		 String value=typesoftreesTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	} else if ("Implementation in Python".equals(string)) {
		 String value=ImpinPythonTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);    
	
	} else if ("Tree Traversals".equals(string)) {
		 String value=treetraversalsTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	} else if ("Traversals-Illustration".equals(string)) {
		 String value=traversalsIllusTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	
	} else if ("Binary Trees".equals(string)) {
		 String value=binaryTreesTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	
	} else if ("Types of Binary Trees".equals(string)) {
		 String value=typesofBTTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
		    
	} else if ("Binary Tree Traversals".equals(string)) {
		 String value=bTreeTraversalsTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
		    
	} else if ("Implementation of Binary Trees".equals(string)) {
		 String value=impofBinaryTreesTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	} else if ("Applications of Binary trees".equals(string)) {
		 String value=appofBinarytreesTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
		    
	} else if ("Binary Search Trees".equals(string)) {
		 String value=binarySearchTreesTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);
	} else {
		 String value=impOfBSTTitle.getText();
		    assertEquals(value,string);
		    Loggerload.info(value);	  	    
		        
	}
}



public void TryEditorwithRunbuttondisplayed() {
	tryEditor.isDisplayed();
	output.isDisplayed();
}

public void clickOnTryHereLink() {
	tryhere.click();
	
}
public void enterValidCodeTryEditorTextArea(String code1) {
	
				 	
    action.moveToElement(tryEditor).doubleClick().click().sendKeys(code1).build().perform();

	
}
public void enterinvalidCodeTryEditorTextArea(String code1) {
	
	
	action.moveToElement(tryEditor).doubleClick().click().sendKeys(code1).build().perform();
}

public void clickOnRunButton() {
	runcode.click();
}

public void displayOutput() {
	String display = output.getText();
	Loggerload.info(display);
}

public void acceptBrowserAlert() {
	 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	 String alertMessage1= alert.getText();
	 Loggerload.info(alertMessage1);
  alert.accept();
}


public void practiceQuestionsDataStructure() {
	
	practiceQuesLink.click();
	
}

public void pagedisp(){
	practiceQuestion_page.isDisplayed();
	}

}

//	
//public void clickOnTerminologies() {
//	
//	terminologies.click();
//	
//}
//
//public void clickOnTypesofTrees() {
//	
//	typesoftrees.click();
//	
//}
//public void clickOnTreeTraversals() {
//	
//	treetraversals.click();
//	
//}
//public void clickOnTraversalsIllustration() {
//	
//	traversalsIllustration.click();
//	
//}
//public void clickOnBinaryTrees() {
//	
//	binaryTrees.click();
//	
//}
//public void clickOnTypesofBinaryTrees() {
//	
//	typesofBT.click();
//	
//}
//public void clickOnImplementationinPython() {
//	
//	ImpinPython.click();
//	
//}
//public void clickOnBinaryTreeTraversals() {
//	bTreeTraversals.click();
//	
//	
//}
//public void clickOnImplementationofBinaryTrees() {
//	impofBinaryTrees.click();
//	
//	
//}
//public void clickOnApplicationsofBinarytrees() {
//	appofBinarytrees.click();
//	
//	
//}
//public void clickOnBinarySearchTrees() {
//	
//	binarySearchTrees.click();
//	
//}
//public void clickOnImplementationOfBST() {
//	
//	impOfBST.click();
//	
//}


