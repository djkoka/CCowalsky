package classwork.spring.medieval;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CCowalsky on 28.12.2015.
 */
public class DamselRescuingKnight {
    private Quest quest;

    @Autowired
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarkQuest(){ quest.embark();  }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("deprecated");
    }
}
