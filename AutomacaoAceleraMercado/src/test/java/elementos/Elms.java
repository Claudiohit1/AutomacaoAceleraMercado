package elementos;

import org.openqa.selenium.By;

public class Elms {

	public By clicarSpan = By.xpath("//div[@id='bg-sombra-floater']//div[2]//span[text()='x']");
	public By clicarNews = By.xpath("//div[@class='navigation-bar']//ul//li//a[text()='Novidades']");
	public By clicarSapato = By.xpath("//div[@class='item-card__description']//div//span[text()='Mocassim Couro Shoestock Tratorado Feminino']");
	public By clicarColor = By.xpath("//div[@class='sku-select circular']//span[text()='Off White']");
	public By clicarTam = By.xpath("//section[@class='product-size-selector']//div//ul//li[6]//a[text()='38']");
	public By clicarBuy = By.xpath("//div[@id='buy-button-wrapper']//button//span[text()='Comprar']");
	public By validarMsg = By.xpath("//li[@class='summary__item summary__items__item']//div[text()='Valor total']");
	public By clicarDelete = By.xpath("//div[@class='cart__items']//div[2]//div//i");
	public By clicarVoltarInicio = By.xpath("//div[@class='empty-page']//div[2]//a");
}
