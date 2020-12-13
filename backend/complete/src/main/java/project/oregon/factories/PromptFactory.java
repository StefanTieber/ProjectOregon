package project.oregon.factories;

import project.oregon.models.Choice;
import project.oregon.models.Prompt;

import project.oregon.constants.ChoiceIds;

public class PromptFactory {

    public static final Choice CHEESEBURGER = new Choice(ChoiceIds.ID_CHEESEBURGER, "Einen Cheeseburger.");
    public static final Choice POMMES = new Choice(ChoiceIds.ID_POMMES, "Nur Pommes.");
    public static final Choice SOSSEN = new Choice(ChoiceIds.ID_SOSSEN, "So viele Soßen wie Sie mir geben können ;)");
    public static final Choice SALAT = new Choice(ChoiceIds.ID_SALAT, "Einen Salat.");
    public static final Choice NUR_ESSEN = new Choice(ChoiceIds.ID_NUR_ESSEN, "Nur das Essen bitte.");
    public static final Choice NEIN_DANKE = new Choice(ChoiceIds.ID_NEIN_DANKE, "Nein Danke.");
    public static final Choice HAB_SCHON_EINE = new Choice(ChoiceIds.ID_HAB_SCHON_EINE, "Ich hab schon eine aber wenn die eingeht weiß ich jetzt wo ich eine neue herbekomme.");
    public static final Choice WASCHMASCHINE_JA = new Choice(ChoiceIds.ID_WASCHMASCHINE_JA, "Ja sicher, wieso nicht.");

    public static Prompt getNeutralEatPrompt() {
        String question = "Willkommen bei McDonalds, was möchten Sie essen?";
        return new Prompt(question, CHEESEBURGER, POMMES, SOSSEN, SALAT);
    }

    public static Prompt getNoWashmachineEatPrompt() {
        String question = "Wenn Sie keine Waschmaschine wollen, was wollen sie denn sonst?";
        return new Prompt(question, CHEESEBURGER, POMMES, SOSSEN, SALAT);
    }

    public static Prompt getWashmachineEatPrompt() {
        String question = "Die sind leider gerade ausgegangen, kann ich Ihnen sonst etwas bringen?";
        return new Prompt(question, CHEESEBURGER, POMMES, SOSSEN, SALAT);
    }

    public static Prompt getWashmachinePrompt() {
        String question = "Sehr gerne, möchten Sie auch eine Waschmaschine dazu?";
        return new Prompt(question, NUR_ESSEN, NEIN_DANKE, HAB_SCHON_EINE, WASCHMASCHINE_JA);
    }
}
