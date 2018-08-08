say a
	| result /= [] = unwords result
	| otherwise = show a
	where result = [output|input <- [a], input `mod` 3 == 0, let output = "Fizz"] ++
				   [output|input <- [a], input `mod` 5 == 0, let output = "Buzz"] ++
				   [output|input <- [a], input `mod` 7 == 0, let output = "Whizz"]