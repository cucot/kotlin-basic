package com.cucot.specialclasses

import com.cucot.specialclasses.SealedClass

// extending sealed class outside of the file (inside the same package) only available from kotlin 5
//class ExtendsSealClassButNotInTheSameDirectory: SealedClass("I am out of the directory")