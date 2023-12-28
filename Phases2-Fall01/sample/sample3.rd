actor Sender (0) {
	knownactors {
		Medium medium;
		Receiver rec;
		Person p;
	}

	actorvars {
		int receivedBit;

	}

	msghandler test(int a) {
        int hasSucceeded;
        String str;

        hasSucceeded = a + self.receivedBit;

        hasSucceeded = a + b;
        hasSucceeded = a + self.b;

        hasSucceeded = 5 + "st" * 3 - "a" * 3;
        hasSucceeded = 5 + "st" * 3 - "a" + 3;

        hasSucceeded = "a";
        hasSucceeded = 1 == 2;
        hasSucceeded = "a" + "b";
        hasSucceeded = -"a";

        medium.get_sum("a"+"b", 1);


        if("a"){
            print(1);
        }

        if(5){
            print(1);
        }
        if(5+"a"){
            print(1);
        }
        if(5==10){
            print(1);
        }

        p.t();
        hasSucceeded.test(a,1);
        hhhh.test(a,1);
        medium.get_minus(2, 1);

        a + a = 2;
        str = 2;
        -str = 2;


    }


}

actor Medium (5){
	knownactors {
    }

    actorvars {
    }

    msghandler get_sum(int a, int b){
        print(a+b);
    }
}


main {
	Sender b (medium, receiver):();
}