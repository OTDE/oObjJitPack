package com.owens.oobjloader.builder;

// This code was written by myself, Sean R. Owens, sean at guild dot net,
// and is released to the public domain. Share and enjoy. Since some
// people argue that it is impossible to release software to the public
// domain, you are also free to use this code under any version of the
// GPL, LPGL, Apache, or BSD licenses, or contact me for use of another
// license.  (I generally don't care so I'll almost certainly say yes.)
// In addition this code may also be used under the "unlicense" described
// at http://unlicense.org/ .  See the file UNLICENSE in the repo.

import java.util.*;

import org.joml.Vector2d;
import org.joml.Vector2f;
import org.joml.Vector3d;
import org.joml.Vector3f;

import java.text.*;
import java.io.*;
import java.io.IOException;

public class FaceVertex {

    int index = -1;
    public Vector3d v = null;
    public Vector2d t = null;
    public Vector3d n = null;

    public String toString() {
        return v + "|" + n + "|" + t;
    }
}