package bbc.participation.accountwrapper.user_interface.ui_model;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Target class for element locator
 *
 * @author Amit Kumar
 */
public class TargetVotingPageView {

	public static Target ENGLISH_TEXT = Target.the("").located(By.xpath(".//*[@id='tm-form-accountWrapperLocale']"));

	public static Target OPTION_ONE = Target.the("").located(By.className("snp-answer-text"));

	public static Target OPTION_TWO = Target.the("").located(By.xpath("//app-answers/div/form/div[2]/div[2]/label"));

	public static Target VOTE_NOW = Target.the("").located(By.xpath("//app-question/div/app-button/div/button"));

	public static Target VOTING_CONFIRMATION = Target.the("").located(By.xpath("//app-component-text-editor[2]/div/div/span"));

	public static Target VOTE_STATE = Target.the("").located(By.xpath("//app-component-text-editor[2]/div/div/span"));

	public static Target VOTE_AGAIN = Target.the("").located(By.xpath("//app-button/div/button"));

	public static Target NON_UK_MSG = Target.the("").located(By.xpath("//app-component-text-editor[1]/div/div/span"));

	public static Target INVALID_VOTE_ID_MSG = Target.the("").located(By.xpath(".//*[@id='account-wrapper-container']/noscript"));

	public static Target HIDDEN_RESULT_MSG = Target.the("").located(By.xpath("//app-component-text-editor[2]/div/div/span"));

}