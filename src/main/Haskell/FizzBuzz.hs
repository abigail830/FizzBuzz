say a
	| result /= [] = unwords result
	| otherwise = show a
	where result = [output|input <- [a], input `mod` 3 == 0, let output = "Fizz"] ++
				   [output|input <- [a], input `mod` 5 == 0, let output = "Buzz"] ++
				   [output|input <- [a], input `mod` 7 == 0, let output = "Whizz"]

say' input = if null desc then show input else desc where
   desc = concat [label | (diviedNumber,label) <- tags, input `mod` diviedNumber == 0]
   tags = [ (3,"Fizz"), (5,"Buzz"), (7,"Whizz") ]