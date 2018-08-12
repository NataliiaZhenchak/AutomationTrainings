using System;
using System.Linq;
using System.Threading;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace SeleniumTests
{
    [TestClass]
    public class UnitTest1
    {
        IWebDriver driver;
        [TestInitialize]
        public void Initialize()
        {
            driver = new ChromeDriver();
            driver.Navigate().GoToUrl("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
            driver.Manage().Window.Maximize();
        }
        [TestCleanup]
        public void CleanUp()
        {
            driver.Close();
        }

        [TestMethod]
        public void Zadanie2()
        {

            driver.SwitchTo().Frame(0);
            string frameAtt1 = driver.FindElement(By.CssSelector(".examp3")).GetAttribute("class");
            Assert.AreEqual("examp3", frameAtt1, "You are not on frame 1");
            driver.SwitchTo().DefaultContent();
            driver.SwitchTo().Frame(1);
            string frameAtt2 = driver.FindElement(By.CssSelector("body[onload='Reset()'] b>font")).Text;
            Assert.AreEqual("Message Book", frameAtt2, "You are not on frame 2");
            driver.SwitchTo().DefaultContent();
            driver.SwitchTo().Frame(2);
            string frameAtt3 = driver.FindElement(By.XPath("//font[contains(text(),'HTML Tags')]")).Text;
            Assert.AreEqual("HTML Tags", frameAtt3, "You are not on frame 3");

        }
        [TestMethod]
        public void Zadanie3()
        {
            driver.SwitchTo().Frame(2);
            driver.FindElement(By.CssSelector("td>a[href='html.htm']")).Click();
            driver.SwitchTo().Window(driver.WindowHandles.Last());
            Assert.AreEqual("HTML Learning Package © Nigel Martin 2000", driver.Title, "Incorrect title");
            driver.Close();
            driver.SwitchTo().Window(driver.WindowHandles.First());
            driver.SwitchTo().Frame(2);
            driver.FindElement(By.CssSelector("h4>a[href='html.htm']")).Click();
            Assert.AreEqual("HTML Learning Package © Nigel Martin 2000", driver.Title, "Incorrect title");

        }
        [TestMethod]
        public void Zadanie4()
        {
            driver.SwitchTo().Frame(1);
            driver.FindElement(By.CssSelector("input[value='Reset']")).Click();
            driver.FindElement(By.CssSelector("input[name='name']")).SendKeys("bobby");
            driver.FindElement(By.CssSelector("textarea[name='suggestions']")).SendKeys("idz spac");
            driver.FindElement(By.CssSelector("input[type='submit']")).Click();
            IAlert alert = driver.SwitchTo().Alert();
            alert.Accept();
            alert.Dismiss();


        }
    }

}
