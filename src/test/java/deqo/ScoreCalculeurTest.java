package deqo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ScoreCalculeurTest {
    @Test
    public void calculeScoreTest(){
        List<Integer> indicesBonnesReponses ;
        indicesBonnesReponses=new ArrayList<>();
        indicesBonnesReponses.add(1);
        indicesBonnesReponses.add(2);
        indicesBonnesReponses.add(3);

        Integer[] valeur  = {1,2,3};
        List<Integer> indicesReponseEtudiant= Arrays.asList(valeur);

        QuestionAChoix q = new QuestionAChoixExclusif("Un enoncé", 30);
        ScoreCalculateur s = new ScoreCalculateur();


        assertEquals("calculeScore : problème",(float) 16.66,s.calculeScore(indicesReponseEtudiant,q),0.01);


    }
}
