 /**
     * BerÃ¤knar kursbetyget utifrÃ¥n ingÃ¥ende betyg pÃ¥ examinationsuppgifter.
     *
     * @author glgren
     */
    public abstract class Student {

        protected String fornamn;
        protected String efternamn;
        protected String[] uppgiftsbetyg;
        protected int antalVgUppgifter;
        protected String kursbetyg;

        /**
         * Skapar ett Student-objekt som sÃ¤tter vÃ¤rden pÃ¥ fÃ¶rnamn, efternamn,
         * ingÃ¥ende betyg pÃ¥ examinationsuppgifter samt hur mÃ¥nga vg-betyg pÃ¥
         * uppgifterna som krÃ¤vs fÃ¶r att erhÃ¥lla kursbetyget vg.
         *
         * @param fornamn studentens fÃ¶rnamn
         * @param efternamn studentens efternamn
         * @param uppgiftsbetyg ingÃ¥ende kursbetyg
         * @param antalVgUppgifter antalet vg betyg som krÃ¤vs
         */
        public Student(String fornamn, String efternamn, String[] uppgiftsbetyg, int antalVgUppgifter) {
            this.fornamn = fornamn;
            this.efternamn = efternamn;
            this.uppgiftsbetyg = uppgiftsbetyg;
            this.antalVgUppgifter = antalVgUppgifter;
        }

        /**
         * Returnerar fÃ¶rnamn
         *
         * @return fÃ¶rnamnet
         */
        public String getFornamn() {
            return fornamn;
        }

        /**
         * Returnerar efternamn
         *
         * @return efternamnet
         */
        public String getEfternamn() {
            return efternamn;
        }

        /**
         * Returnerar en array med betyg fÃ¶r fÃ¶r uppgifter dÃ¤r betyget kan vara av
         * fÃ¶ljande, tre grader: "vg", "g" eller "u".
         *
         * @return uppgiftsbetygen
         */
        public String[] getUppgiftsbetyg() {
            return uppgiftsbetyg;
        }

        /**
         * Returnerar hur mÃ¥nga av de ingÃ¥ende uppgifterna som mÃ¥ste ha betyget vg
         * fÃ¶r att kursbetyget ocksÃ¥ bli vg.
         *
         * @return antalet vg betyg som krÃ¤vs
         */
        public int getAntalVgUppgifter() {
            return antalVgUppgifter;
        }

        /**
         * Returnerar kursbetyget som berÃ¤kas utifrÃ¥n de ingÃ¥ende uppgiftsbetygen
         * samt antalet vg-betyg. Betyget kan vara nÃ¥gon av fÃ¶ljande tre grader:
         * "vg", "g" eller "u".
         *
         * @return kursbetyg.
         */
        public abstract String getKursbetyg();

    }



