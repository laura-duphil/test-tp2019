package deqo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionAChoixExclusifTest {
    @Test
    public void getEnonceTest(){
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("Un enoncé", 30);

        assertEquals("getEnonce() pose pb","Un enoncé",q.getEnonce());

    }

    @Test
    public void getScoreForIndiceTest(){
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("Un enoncé", 30);
        float bonneReponse = (float) 100.0;
        float laReponse = q.getScoreForIndice(40);
        float mauvaiseReponse = (float) 0.0;

        assertEquals("getScoreForIndice pose pb",bonneReponse,laReponse,0.1);

        //assertNotEquals("getScoreForIndice pose pb " + mauvaiseReponse,mauvaiseReponse,laReponse);
    }
}
