import java.util.ArrayList;
import java.util.List;

public class Student
{

    private String name, gender, id;
    private List<Score> scoreList;


    //Constructor
    public Student()
    {
        this.name = "";
        this.gender = "";
        this.id = "";
        this.scoreList = new ArrayList<Score>();
    }


    //Gettters and Setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public List<Score> getScoreList()
    {
        return this.scoreList;
    }

    //Students scores
    public int getScore(String subjectID)
    {
        for (Score score : this.scoreList)
        {
            if (score.getSubject().getId().equals(subjectID))
            {
                return score.getValue();
            }
        }
        return -1;
    }

    public void setScoreList(Score score)
    {
        this.scoreList.add(score);
    }
}
