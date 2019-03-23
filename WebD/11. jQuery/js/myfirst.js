$(function () {
  $('h1').text('Hello jQuery').css('color', 'red')

  $('#tab-menu > li > a').click(function () {
    const pageNum = $(this).attr('data-page')
    const pageId = "#tab" + pageNum

    $('div.tab-page').hide()
    $(pageId).show()
  })

  $('#mainMenu > li > a').on('click', function () {
    const speed = "fast"
    const parent = $(this).parent('li')

    $(this).next('.subMenu').toggle('fast')
    parent.prevAll().children('.subMenu').hide(speed)
    parent.nextAll().children('.subMenu').hide(speed)
  })

  $('a[href^="#"]').click(function () {
    const href = $(this).attr('href')
    const target = $(href)
    const posTop = target.offset().top

    $('body,html').animate({
      scrollTop: posTop
    }, 300, 'swing')
    return false
  })
})
