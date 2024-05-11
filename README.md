# Macropad

Macropad for shorcuts
Structure:
<ul>
<li>Jframe "frame"</li>
    <ul>
    <li>JPanel "cardPanel"</li>
        <ul>
        <li>JPanel "homepage"</li>
        <li>JPanel macOS</li>
        <li>JPanel windowsOS</li>
        </ul>
    </ul>
</ul>
<br>
<p>search "osascript" for applescripts to integrate<br></p>
<a href="https://developer.apple.com/library/archive/documentation/AppleScript/Conceptual/AppleScriptLangGuide/conceptual/ASLR_lexical_conventions.html#//apple_ref/doc/uid/TP40000983-CH214-SW23">
Osascript documentation</a><br>
<a href="https://alvinalexander.com/blog/post/mac-os-x/applescript-basic-math-operations/">Osascript math operations</a>
<h1>Build Jar file:</h1>
<p>File->Project Structure->Artifacts<br>
Press "+" -> "Jar" -> "From modules with dependencies"<br>
Select main class->"ok"

Build Artifacts->build</p>

You find the jar inside artifacts folder of the project