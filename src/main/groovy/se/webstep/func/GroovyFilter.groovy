package se.webstep.func

def names = ["Arthur Dent", "Ford Prefect", "Zaphod Beeblebrox", "Marvin", "Trillian", "Slartibartfast"]
def longNames = names.findAll { it.length() > 12 }
println longNames.join(", ")
// Zaphod Beeblebrox, Slartibartfast

def numbers = (1..100).findAll { it % 13 == 0 }
println numbers.join(", ")
// 13, 26, 39, 52, 65, 78, 91


