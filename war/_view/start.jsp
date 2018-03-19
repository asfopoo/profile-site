<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900,400italic,700italic,900italic|Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="webresources/game.css">
    <title>Game</title>
    <meta name="viewport" content="width=device-width">
    <link rel="icon" type="image/x-icon" href="webresources/favicon.ico" />
</head>
<body bgcolor: #FDF5E6 >

<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
<div class="head">
    <div class="headerobjectswrapper">
        <div class="weatherforcastbox"><span style="font-style: italic;">Weatherforcast for the next 24 hours: Plenty of Sunshine</span><br><span>Wind: 7km/h SSE; Ther: 21°C; Hum: 82%</span></div>
        <header>York Daily Sun</header>
    </div>

    <div class="subhead">York, PA - Monday March 19th, 2018 - Seven Pages</div>
</div>
<div class="content">
    <div class="collumns">
        <div class="collumn">
            <div class="head"><span class="headline hl3">When darkness overspreads my eyes</span><p><span class="headline hl4">by JOHANN WOLFGANG VON GOETHE</span></p></div>
            When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream;<p>and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel the presence of the Almighty, who formed us in his own image, and the breath of that universal love which bears and sustains us, as it floats around us in an eternity of bliss; and then, my friend, when darkness overspreads my eyes, and heaven and earth seem to dwell in my soul and absorb its power, like the form of a beloved mistress, then I often think with longing, Oh, would I could describe these conceptions, could impress upon paper all that is living so full and warm within me, that it might be the mirror of my soul, as my soul is the mirror of the infinite God!</p></div>
        <div class="collumn">
            <div class="head"><span class="headline hl5">Fire warning</span><p><span class="headline hl6">Dont touch it!</span></p></div>
            <figure class="figure">
								<img class="media" src="https://images.pexels.com/photos/37543/firefighters-training-live-fire-37543.jpeg?w=940&h=650&auto=compress&cs=tinysrgb" alt="">
								<figcaption class="figcaption">Fire Safety Warning.</figcaption>
						</figure>

            <p>Always remember fire saftey.  Use any available extiguisher possible and always remember to stop drop and roll....some other hint to be used later in the game!!!</p>
            <p>The CDC is strongly urging everyone to wear protective masks, long sleeves and long pants.  Everyone is urged to protect themselves
  		at all costs.  Stock up on food and water as much as possible.</p>
            </div>
        <div class="collumn"><div class="head"><span class="headline hl1">BREAKING NEWS</span><p><span class="headline hl2">Zombies?</span></p></div>
        <p>There was a recent outbreak of the mutated rabies virus that has been causing mass hysteria.
      If infected, the virus causes high fever quickly followed
	  by some form of psychosis.  Authorities are still looking into the origin , but everyone
	  is urged to stay inside and lock all doors and windows.  The infected are considered extremely 
	  dangerous!!!!</p>
		</div>
        <div class="collumn"><div class="head"><span class="headline hl3">The buzz of the little world </span><p><span class="headline hl4">A thousand unknown plants</span></p></div><p>I should be incapable of drawing a single stroke at the present moment; and yet I feel that I never was a greater artist than now. When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel the presence of the Almighty, who formed us in his own image, and the breath</p></div>
        <div class="collumn"><div class="head"><span class="headline hl1">It wasn't a dream </span><p><span class="headline hl4">by FRANZ KAFKA</span></p></div><p>One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections. The bedding was hardly able to cover it and seemed ready to slide off any moment. </p>
					
					<p>His many legs, pitifully thin compared with the size of the rest of him, waved about helplessly as he looked. "What's happened to me?" he thought. It wasn't a dream. His room, a proper human room although a little too small, lay peacefully between its four familiar walls. A collection of textile samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower arm towards the viewer. Gregor then turned to look out the window at the dull weather. </p></div>
    </div>
</div>

<form method = "post" action="/OrganTrail/bedroom">
	<button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Click to continue</button>
</form>

</body>
</html>
