# probabilistic
A simple library implementing simple probabilistic programming features.

Probabilistic assignment:

        Prob p = new Prob();
        Integer[] checkem = {0, 1, 2, 3};
        int d = p.pick(checkem); //uniform

        Double[] distrib = {0.4, 0.1, 0.25, 0.25};
        d = p.pick(checkem, distrib);

Probabilistic choice:

        Prob p = new Prob();
        Double[] distrib = {0.4, 0.1, 0.25, 0.25};
        switch (p.choose(distrib))
        {
            case 0: //probability of execution 0.4
                break;
            case 1: //probability of execution 0.1
                break;
            case 2: //probability of execution 0.25
                break;
            case 3: //probability of execution 0.25
                break;
            default:
        }
