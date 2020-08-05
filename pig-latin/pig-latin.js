//
// This is only a SKELETON file for the 'Pig Latin' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class translator {
    static translate(word) {
        if (word.split(" ").length > 1) {
            let translatedText = "";
            for (let s of word.split(" "))
                translatedText += this.translate(s) + " ";
            return translatedText.trim();
        }
        if ("aeiou".includes(word[0]) || word.match("^(x|y)(?!e).*"))
            return word + 'ay';
        if (word.match("^([^aeiou]qu|thr|sch).*"))
            return word.slice(3) + word.slice(0, 3) + 'ay';
        if (word.match("^(ch|qu|th).*"))
            return word.slice(2) + word.slice(0, 2) + 'ay';
        if (word.match("^[a-zA-Z]+(?=y).*"))
            return word.slice(word.indexOf('y')) + word.slice(0, word.indexOf('y')) + 'ay';
        return word.slice(1) + word[0] + 'ay'
    }
}