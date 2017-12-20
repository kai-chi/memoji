package kaichi.memoji.data;

import java.util.concurrent.ThreadLocalRandom;

public class Emojis {

    private static int[] emojis = {
            0x1F601, //grinning face with smiling eyes
            0x1F602, //face with tears of joy
            0x1F603, //smiling face with open mouth
            0x1F604, //smiling face with open mouth and smiling eyes
            0x1F605, //smiling face with open mouth and cold sweat
            0x1F606, //smiling face with open mouth and tightly-closed eyes
            0x1F609, //winking face
            0x1F60A, //smiling face with smiling eyes
            0x1F60B, //face savouring delicious food
            0x1F60C, //relieved face
            0x1F60D, //smiling face with heart-shaped eyes
            0x1F60F, //smirking face
            0x1F612, //unamused face
            0x1F613, //face with cold sweat
            0x1F614, //pensive face
            0x1F616, //confounded face
            0x1F618, //face throwing a kiss
            0x1F61A, //kissing face with closed eyes
            0x1F61C, //face with stuck-out tongue and winking eye
            0x1F61D, //face with stuck-out tongue and tightly-closed eyes
            0x1F61E, //disappointed face
            0x1F620, //angry face
            0x1F621, //pouting face
            0x1F622, //crying face
            0x1F623, //persevering face
            0x1F624, //face with look of triumph
            0x1F625, //disappointed but relieved face
            0x1F628, //fearful face
            0x1F629, //weary face
            0x1F62A, //sleepy face
            0x1F62B, //tired face
            0x1F62D, //loudly crying face
            0x1F630, //face with open mouth and cold sweat
            0x1F631, //face screaming in fear
            0x1F632, //astonished face
            0x1F633, //flushed face
            0x1F635, //dizzy face
            0x1F637, //face with medical mask
            0x1F638, //grinning cat face with smiling eyes
            0x1F639, //cat face with tears of joy
            0x1F63A, //smiling cat face with open mouth
            0x1F63B, //smiling cat face with heart-shaped eyes
            0x1F63C, //cat face with wry smile
            0x1F63D, //kissing cat face with closed eyes
            0x1F63E, //pouting cat face
            0x1F63F, //crying cat face
            0x1F640, //weary cat face
            0x1F645, //face with no good gesture
            0x1F646, //face with ok gesture
            0x1F647, //person bowing deeply
            0x1F648, //see-no-evil monkey
            0x1F649, //hear-no-evil monkey
            0x1F64A, //speak-no-evil monkey
            0x1F64B, //happy person raising one hand
            0x1F64C, //person raising both hands in celebration
            0x1F64D, //person frowning
            0x1F64E, //person with pouting face
            0x1F64F, //person with folded hands
    };

    private static final int EMOJI_SIZE = emojis.length;

    public static int getRandomEmojiUnicode() {
        int random = ThreadLocalRandom.current().nextInt(0,
                                                         EMOJI_SIZE);
        return emojis[random];
    }

    public static String getRandomEmojiString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(getRandomEmojiChar());
        }
        return sb.toString();
    }

    public static char getRandomEmojiChar() {
        int random = ThreadLocalRandom.current().nextInt(0,
                                                         EMOJI_SIZE);
        return Character.toChars(random)[0];
    }
}
