package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    final static String URL = "https://www.tunisianet.com.tn/";
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        /* Ouvrir le site*/
        driver.get(URL);
        Thread.sleep(3000);

        /* liquer sur le bouton user icon */ 
        WebElement userBouton= driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
        userBouton.click();
        Thread.sleep(3000);

        /* Cliquer sur le bouton de connexion dans le dropdown */
        WebElement dropDownBouton= driver.findElement(By.cssSelector("#_desktop_user_info > ul > li > a"));
        dropDownBouton.click();
        Thread.sleep(3000);

        /* Saisir votre email */
        WebElement emailSaisi= driver.findElement(By.cssSelector("#login-form > section > div:nth-child(2) > div.col-md-6 > input"));
        emailSaisi.sendKeys("tp.seleniumISO@gmail.com");
        Thread.sleep(3000);

        /* Saisir votre password */
        WebElement passwordSaissi= driver.findElement(By.cssSelector("#login-form > section > div:nth-child(3) > div.col-md-6 > div > input"));
        passwordSaissi.sendKeys("tpSelenium");
        Thread.sleep(3000);

        /* Cliquer sur le bouton de connexion pour terminer l’authentification */ 
        WebElement authentificationBouton= driver.findElement(By.cssSelector("#submit-login"));
        authentificationBouton.click();
        Thread.sleep(3000);


        /* Rechercher */
        WebElement searchInput= driver.findElement(By.cssSelector("#search_query"));
        searchInput.sendKeys("PC portable MacBook M1 13.3");
        Thread.sleep(3000);


        /* Cliquer sur le bouton de recherche */
        WebElement searchButton= driver.findElement(By.cssSelector("#sp-btn-search > button"));
        searchButton.click();
        Thread.sleep(3000);


        /* Cliquer sur le 1er élément résultant de la recherche */
        WebElement firstItemBouton= driver.findElement(By.cssSelector("#js-product-list > div > div:nth-child(1) > article > div > div.wb-image-block.col-lg-3.col-xl-3.col-md-4.col-sm-4.col-xs-6 > a"));
        firstItemBouton.click();
        Thread.sleep(3000);


        /* Cliquer sur le bouton Ajouter au panier */ 
        WebElement ajouterProduitBouton= driver.findElement(By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button"));
        ajouterProduitBouton.click();
        Thread.sleep(3000);


        /* Cliquer sur le bouton commander dans le pop up */
        WebElement commanderBouton= driver.findElement(By.cssSelector("#blockcart-modal > div > div > div > div.col-xs-12.cart-content > div > div > a"));
        commanderBouton.click();
        Thread.sleep(3000);

        /* Cliquer sur le bouton commander dans le panier */
        WebElement confirmerCommandeBouton= driver.findElement(By.cssSelector("#main > div > div > div.checkout.cart-detailed-actions.card-block > div > a"));
        confirmerCommandeBouton.click();
        Thread.sleep(3000);
    }
}
