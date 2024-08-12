package in.co.nmsworks.week1;

/*print each sentence in the given paragraph in a new line.
        Input : The early morning sun cast a golden hue over the
        quiet village, where the scent of blooming jasmine mingled
        with the crisp, cool air. As the first light of day filtered
        through the canopy of ancient oak trees, the streets began to
        stir with the soft chatter of locals preparing for the day ahead.
        Children darted around with laughter, their voices a cheerful contrast to the
         serene landscape. In the heart of the village, t
        he old bakery's doors creaked open, releasing the warm,
        inviting aroma of freshly baked bread, promising a
        comforting start to the day for everyone within reach.
 */

public class Training5 {
    String str = ("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");

    public void newLine() {
        String[] stringArray = str.split("\\. ");
        for (String i:stringArray) {
            System.out.println(i);
        }
    }
}
