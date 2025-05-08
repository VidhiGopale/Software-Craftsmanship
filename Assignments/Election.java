public class Election {

    public static void main(String[] args) {
        String[] data = {
            "Jaipur-BJP=400,INC=250,CPI=20,NCP=850",
            "Mumbai-BJP=300,INC=350,BSP=600,CPI=50",
            "Bhopal-INC=400,BJP=200,IND=200,NCP=600"
        };

        String[] codes = {"BJP", "INC", "BSP", "CPI", "NCP", "IND"};
        String[] names = {
            "Bhartiya Janta Party",
            "Indian National Congress",
            "Bahujan Samaj Party",
            "Communist Party of India",
            "Nationalist Congress Party",
            "Independant"
        };

        System.out.println("Constituency, Winning Party, Vote Share");

        for (String line : data) {
            String[] parts = line.split("-");
            String constituency = parts[0];
            String[] Votedata = parts[1].split(",");
            
            String winningParty = "";
            int winningVotes = 0;
            int totalVotes = 0;

            for (String entry : Votedata) {
                String[] votePair = entry.split("=");
                String partyCode = votePair[0];
                int votes = Integer.parseInt(votePair[1]);

                totalVotes += votes;

                if (votes > winningVotes) {
                    winningVotes = votes;
                    winningParty = partyCode;
                }
            }

            String WinningPartyName = "";

            for (int i = 0; i <codes.length ; i++) {
                if (codes[i].equals(winningParty)) {
                    WinningPartyName = names[i];
                    break;
                }
            }

         double voteShare = ((double) winningVotes / totalVotes) * 100;
         System.out.printf("%s, %s, %.2f%%\n", constituency, WinningPartyName, voteShare);
        }
    }
}