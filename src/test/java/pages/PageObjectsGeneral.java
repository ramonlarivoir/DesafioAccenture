package pages;

import seleniumInfra.InfraBrowser;
import seleniumInfra.InfraButton;
import seleniumInfra.InfraCheckbox;
import seleniumInfra.InfraInput;
import seleniumInfra.InfraRadio;
import seleniumInfra.InfraSelect;
import seleniumInfra.InfraTextArea;
import seleniumInfra.InfraValidation;

public abstract class PageObjectsGeneral {
	
	public InfraBrowser browser;
	public InfraButton button;
    public InfraInput input;
    public InfraBrowser navegador;
    public InfraSelect select;
    public InfraRadio radio;
    public InfraCheckbox checkbox;
    public InfraTextArea textArea;
    public InfraValidation validation;

    public PageObjectsGeneral()
    {
    	browser = new InfraBrowser();
        button = new InfraButton();
        input = new InfraInput();
        navegador = new InfraBrowser();
        select = new InfraSelect();
        radio = new InfraRadio();
        checkbox = new InfraCheckbox();
        textArea = new InfraTextArea();
        validation = new InfraValidation();
    }
}
