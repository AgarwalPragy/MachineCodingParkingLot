1. DBObject class is a nice Trick. So there are many classes like Person, Gate, Spot etc. We need unique id for all of them.
  Rather than keeping a static variable uid for all of them seperately, we make them inherit from a class called DBObject and
  that class keeps track of this uid.
2. Some objects can have a reference to other objects for keeping track, rather than seperate map. Ex. The Account class has a
  member variable called Person, even though account doesn't own it. It tells the account, what member is associated with that
  account.
3. We can take real world examples also, to build relationships. Ex. Exit panel, Electric vehicle charge panel, notification panel
  etc. are all electronics. So they can all inherit from a class called Electronice, as mentioned in code.
