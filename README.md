# Oblig3

For å kunne løse oppgaven måtte jeg sette opp github action for å runne tester jeg har skrevet i forrige oppgave. For å gjøre dette måtte jeg lage en ny fil kaldt maven.yml som ligger i undermappene .github/workflows. Inne i denne filen ligger run scriptet som builder maven, setter opp jdk og til slutt tester classene jeg har med Test annotation.

Det tokk noen forskjøk med feiling og prøving før jeg kom fram til hva jeg måtte gjøre, måtte for eksempel endre pom'en min til å builde med en sure-fire plugin og endre på maven.yml scripte der det feilet.

Til slutt vet jeg at alt funket ettersom action'en ble godkjent og test "steppet" i script filen fikk build success med 4 tester.
