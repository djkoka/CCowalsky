package classwork.spring;

/**
 * Created by CCowalsky on 28.12.2015.
 */
public class DamselRescuingKnight {
    private Quest quest;


    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarQuest(){
        quest.embark();
    }


}
