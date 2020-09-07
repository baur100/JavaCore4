package helpersYK;

import ModelsYK.*;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public class RandomGenerator {
    public static String randomStringGenerator (int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static PostPetRequest postPetRequestGenerator(){
        Random random = new Random();
        Category ct = new Category(random.nextInt(1001), randomStringGenerator(7));
        Tag tag = new Tag(random.nextInt(500), randomStringGenerator(5));
        Tag tag1 = new Tag(random.nextInt(300), randomStringGenerator(3));
        String name  = randomStringGenerator(10);
        String status = "pending";
        return new PostPetRequest(ct, name, new String[]{"www.google", "www.ok.com"}, new Tag[]{tag, tag1,}, status);
    }

    public static PutPetRequest putPetRequestGenerator(){
        Random random = new Random();
        Category ct = new Category(random.nextInt(1001), randomStringGenerator(7));
        Tag tag = new Tag(random.nextInt(500), randomStringGenerator(5));
        Tag tag1 = new Tag(random.nextInt(300), randomStringGenerator(3));
        String name  = randomStringGenerator(10);
        String status = "pending";
        return new PutPetRequest(ct, name, new String[]{"www.google", "www.ok.com"}, new Tag[]{tag, tag1,}, status);
    }

    public static PostPlaylistRequest postPlaylistRequestGenerator(){
        Random random = new Random();
        String nameOfPl = new String(randomStringGenerator(8));
        return new PostPlaylistRequest(nameOfPl);
    }


}
