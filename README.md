# What is this?

I've modified a java library by Sean R. Owens to work with a ray tracer
that I'm building with Ethan Wiederspan for a capstone. I'm using JitPack
to repackage this into my own repository, which JitPack checks out and builds
into a dependency I can use in our ray tracer project. If I modify the code base
in some way, my build.gradle file will check for changes and rebuild the library.
This allows me to independently modify the code for the parser library
while keeping the ray tracing software in a separate repo. Automation!

I've modified the Build implementation to make this code "work" with our
ray tracer. The initial implementation had some bespoke code
for defining vertices and faces that didn't line up with the way we wanted
.obj data to be interpreted. I added the Java Open Math Library (JOML) to
the repo's dependencies and made the Face and Vertex code more JOML-friendly.
Additionally, the face code doesn't treat every face as a triangle, like we
are, so I modified the code to work exclusively with triangles.

Cheers!

Seth Chapman (OTDE)

For a look at the original code base, you can go [here.](https://github.com/seanrowens/oObjLoader)
