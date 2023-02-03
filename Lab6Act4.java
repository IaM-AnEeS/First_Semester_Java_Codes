public class Lab6Act4 {
    public static void main(String[] args) {
        String sentence;
        String str1;
        String str2;
        int index;
        sentence="This world Shell know Pain Now Almighty Push";
        System.out.println("sentence =\""+ sentence +"\"");
        System.out.println("The lenght of the sentence is "+ sentence.length());
        System.out.println("The cheracter at index 14 " + sentence.charAt(14));
        System.out.println("The index of first t in sentence= "+sentence.indexOf('t'));
        System.out.println("sentence .substrinf(0,6)=\""+sentence.substring(0,6)+"\"");
        System.out.println("sentence .substrinf(7,12)=\""+sentence.substring(7,12)+"\"");
        System.out.println("sentence .substrinf(13,22)=\""+sentence.substring(13,22)+"\"");
        System.out.println("sentence .substrinf(22,31)=\""+sentence.substring(22,31)+"\"");

        str1 = sentence.substring(0, 8);
        System.out.println("str1 = \"" + str1 + "\"");
        str2 = sentence.substring(2, 12);
        System.out.println("str2 = \"" + str2 + "\"");
        System.out.println("sentence in uppercase = \""+ sentence.toUpperCase() + "\"");
        index = sentence.indexOf("pain");
        str1 = sentence.substring(index, index + 14);
        System.out.println("str1 = \"" + str1 + "\"");
        System.out.println("sentence.replace('t', 'T' ) = \""+sentence.replace('p', 'P') + "\"");
    }
}
