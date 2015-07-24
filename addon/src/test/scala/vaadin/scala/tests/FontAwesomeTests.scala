package vaadin.scala.tests

import vaadin.scala.server.FontAwesome

/**
 *
 * @author Henri Kerola / Vaadin
 */
class FontAwesomeTests extends ScaladinTestSuite {

  ignore("generate constants") {
    com.vaadin.server.FontAwesome.values.foreach { v =>
      val scalaName = v.name().split("_").map(p => p.substring(0, 1).toUpperCase + p.substring(1).toLowerCase).mkString
      println("val " + scalaName + " = FontAwesome(" + v.name() + ")")
    }
  }

  test("All FontAwesome constants are defined") {
    FontAwesome.Glass
    FontAwesome.Music
    FontAwesome.Search
    FontAwesome.EnvelopeO
    FontAwesome.Heart
    FontAwesome.Star
    FontAwesome.StarO
    FontAwesome.User
    FontAwesome.Film
    FontAwesome.ThLarge
    FontAwesome.Th
    FontAwesome.ThList
    FontAwesome.Check
    FontAwesome.Times
    FontAwesome.SearchPlus
    FontAwesome.SearchMinus
    FontAwesome.PowerOff
    FontAwesome.Signal
    FontAwesome.Cog
    FontAwesome.TrashO
    FontAwesome.Home
    FontAwesome.FileO
    FontAwesome.ClockO
    FontAwesome.Road
    FontAwesome.Download
    FontAwesome.ArrowCircleODown
    FontAwesome.ArrowCircleOUp
    FontAwesome.Inbox
    FontAwesome.PlayCircleO
    FontAwesome.Repeat
    FontAwesome.Refresh
    FontAwesome.ListAlt
    FontAwesome.Lock
    FontAwesome.Flag
    FontAwesome.Headphones
    FontAwesome.VolumeOff
    FontAwesome.VolumeDown
    FontAwesome.VolumeUp
    FontAwesome.Qrcode
    FontAwesome.Barcode
    FontAwesome.Tag
    FontAwesome.Tags
    FontAwesome.Book
    FontAwesome.Bookmark
    FontAwesome.Print
    FontAwesome.Camera
    FontAwesome.Font
    FontAwesome.Bold
    FontAwesome.Italic
    FontAwesome.TextHeight
    FontAwesome.TextWidth
    FontAwesome.AlignLeft
    FontAwesome.AlignCenter
    FontAwesome.AlignRight
    FontAwesome.AlignJustify
    FontAwesome.List
    FontAwesome.Outdent
    FontAwesome.Indent
    FontAwesome.VideoCamera
    FontAwesome.PictureO
    FontAwesome.Pencil
    FontAwesome.MapMarker
    FontAwesome.Adjust
    FontAwesome.Tint
    FontAwesome.PencilSquareO
    FontAwesome.ShareSquareO
    FontAwesome.CheckSquareO
    FontAwesome.Arrows
    FontAwesome.StepBackward
    FontAwesome.FastBackward
    FontAwesome.Backward
    FontAwesome.Play
    FontAwesome.Pause
    FontAwesome.Stop
    FontAwesome.Forward
    FontAwesome.FastForward
    FontAwesome.StepForward
    FontAwesome.Eject
    FontAwesome.ChevronLeft
    FontAwesome.ChevronRight
    FontAwesome.PlusCircle
    FontAwesome.MinusCircle
    FontAwesome.TimesCircle
    FontAwesome.CheckCircle
    FontAwesome.QuestionCircle
    FontAwesome.InfoCircle
    FontAwesome.Crosshairs
    FontAwesome.TimesCircleO
    FontAwesome.CheckCircleO
    FontAwesome.Ban
    FontAwesome.ArrowLeft
    FontAwesome.ArrowRight
    FontAwesome.ArrowUp
    FontAwesome.ArrowDown
    FontAwesome.Share
    FontAwesome.Expand
    FontAwesome.Compress
    FontAwesome.Plus
    FontAwesome.Minus
    FontAwesome.Asterisk
    FontAwesome.ExclamationCircle
    FontAwesome.Gift
    FontAwesome.Leaf
    FontAwesome.Fire
    FontAwesome.Eye
    FontAwesome.EyeSlash
    FontAwesome.ExclamationTriangle
    FontAwesome.Plane
    FontAwesome.Calendar
    FontAwesome.Random
    FontAwesome.Comment
    FontAwesome.Magnet
    FontAwesome.ChevronUp
    FontAwesome.ChevronDown
    FontAwesome.Retweet
    FontAwesome.ShoppingCart
    FontAwesome.Folder
    FontAwesome.FolderOpen
    FontAwesome.ArrowsV
    FontAwesome.ArrowsH
    FontAwesome.BarChartO
    FontAwesome.TwitterSquare
    FontAwesome.FacebookSquare
    FontAwesome.CameraRetro
    FontAwesome.Key
    FontAwesome.COGS
    FontAwesome.Comments
    FontAwesome.ThumbsOUp
    FontAwesome.ThumbsODown
    FontAwesome.StarHalf
    FontAwesome.HeartO
    FontAwesome.SignOut
    FontAwesome.LinkedInSquare
    FontAwesome.ThumbTack
    FontAwesome.ExternalLink
    FontAwesome.SignIn
    FontAwesome.Trophy
    FontAwesome.GithubSquare
    FontAwesome.Upload
    FontAwesome.LemonO
    FontAwesome.Phone
    FontAwesome.SquareO
    FontAwesome.BookmarkO
    FontAwesome.PhoneSquare
    FontAwesome.Twitter
    FontAwesome.Facebook
    FontAwesome.GitHub
    FontAwesome.Unlock
    FontAwesome.CreditCard
    FontAwesome.RSS
    FontAwesome.HddO
    FontAwesome.Bullhorn
    FontAwesome.Bell
    FontAwesome.Certificate
    FontAwesome.HandORight
    FontAwesome.HandOLeft
    FontAwesome.HandOUp
    FontAwesome.HandODown
    FontAwesome.ArrowCircleLeft
    FontAwesome.ArrowCircleRight
    FontAwesome.ArrowCircleUp
    FontAwesome.ArrowCircleDown
    FontAwesome.Globe
    FontAwesome.Wrench
    FontAwesome.Tasks
    FontAwesome.Filter
    FontAwesome.Briefcase
    FontAwesome.ArrowsAlt
    FontAwesome.Users
    FontAwesome.Link
    FontAwesome.Cloud
    FontAwesome.Flask
    FontAwesome.Scissors
    FontAwesome.FilesO
    FontAwesome.Paperclip
    FontAwesome.FloppyO
    FontAwesome.Square
    FontAwesome.Bars
    FontAwesome.ListUl
    FontAwesome.ListOl
    FontAwesome.Strikethrough
    FontAwesome.Underline
    FontAwesome.Table
    FontAwesome.Magic
    FontAwesome.Truck
    FontAwesome.Pinterest
    FontAwesome.PinterestSquare
    FontAwesome.GooglePlusSquare
    FontAwesome.GooglePlus
    FontAwesome.Money
    FontAwesome.CaretDown
    FontAwesome.CaretUp
    FontAwesome.CaretLeft
    FontAwesome.CaretRight
    FontAwesome.Columns
    FontAwesome.Sort
    FontAwesome.SortAsc
    FontAwesome.SortDesc
    FontAwesome.Envelope
    FontAwesome.Linkedin
    FontAwesome.Undo
    FontAwesome.Gavel
    FontAwesome.Tachometer
    FontAwesome.CommentO
    FontAwesome.CommentsO
    FontAwesome.Bolt
    FontAwesome.Sitemap
    FontAwesome.Umbrella
    FontAwesome.Clipboard
    FontAwesome.LightbulbO
    FontAwesome.Exchange
    FontAwesome.CloudDownload
    FontAwesome.CloudUpload
    FontAwesome.UserMd
    FontAwesome.Stethoscope
    FontAwesome.Suitcase
    FontAwesome.BellO
    FontAwesome.Coffee
    FontAwesome.Cutlery
    FontAwesome.FileTextO
    FontAwesome.BuildingO
    FontAwesome.HospitalO
    FontAwesome.Ambulance
    FontAwesome.Medkit
    FontAwesome.FighterJet
    FontAwesome.Beer
    FontAwesome.HSquare
    FontAwesome.PlusSquare
    FontAwesome.AngleDoubleLeft
    FontAwesome.AngleDoubleRight
    FontAwesome.AngleDoubleUp
    FontAwesome.AngleDoubleDown
    FontAwesome.AngleLeft
    FontAwesome.AngleRight
    FontAwesome.AngleUp
    FontAwesome.AngleDown
    FontAwesome.Desktop
    FontAwesome.Laptop
    FontAwesome.Tablet
    FontAwesome.Mobile
    FontAwesome.CircleO
    FontAwesome.QuoteLeft
    FontAwesome.QuoteRight
    FontAwesome.Spinner
    FontAwesome.Circle
    FontAwesome.Reply
    FontAwesome.GitHubAlt
    FontAwesome.FolderO
    FontAwesome.FolderOpenO
    FontAwesome.SmileO
    FontAwesome.FrownO
    FontAwesome.MehO
    FontAwesome.Gamepad
    FontAwesome.KeyboardO
    FontAwesome.FlagO
    FontAwesome.FlagCheckered
    FontAwesome.Terminal
    FontAwesome.Code
    FontAwesome.ReplyAll
    FontAwesome.MailReplyAll
    FontAwesome.StarHalfO
    FontAwesome.LocationArrow
    FontAwesome.Crop
    FontAwesome.CodeFork
    FontAwesome.ChainBroken
    FontAwesome.Question
    FontAwesome.Info
    FontAwesome.Exclamation
    FontAwesome.Superscript
    FontAwesome.Subscript
    FontAwesome.Eraser
    FontAwesome.PuzzlePiece
    FontAwesome.Microphone
    FontAwesome.MicrophoneSlash
    FontAwesome.Shield
    FontAwesome.CalendarO
    FontAwesome.FireExtinguisher
    FontAwesome.Rocket
    FontAwesome.Maxcdn
    FontAwesome.ChevronCircleLeft
    FontAwesome.ChevronCircleRight
    FontAwesome.ChevronCircleUp
    FontAwesome.ChevronCircleDown
    FontAwesome.HTML5
    FontAwesome.CSS3
    FontAwesome.Anchor
    FontAwesome.UnlockAlt
    FontAwesome.Bullseye
    FontAwesome.EllipsisH
    FontAwesome.EllipsisV
    FontAwesome.RssSquare
    FontAwesome.PlayCircle
    FontAwesome.Ticket
    FontAwesome.MinusSquare
    FontAwesome.MinusSquareO
    FontAwesome.LevelUp
    FontAwesome.LevelDown
    FontAwesome.CheckSquare
    FontAwesome.PencilSquare
    FontAwesome.ExternalLinkSquare
    FontAwesome.ShareSquare
    FontAwesome.Compass
    FontAwesome.CaretSquareODown
    FontAwesome.CaretSquareOUp
    FontAwesome.CaretSquareORight
    FontAwesome.EUR
    FontAwesome.GBP
    FontAwesome.USD
    FontAwesome.INR
    FontAwesome.JPY
    FontAwesome.RUB
    FontAwesome.KRW
    FontAwesome.BTC
    FontAwesome.File
    FontAwesome.FileText
    FontAwesome.SortAlphaAsc
    FontAwesome.SortAlphaDesc
    FontAwesome.SortAmountAsc
    FontAwesome.SortAmountDesc
    FontAwesome.SortNumericAsc
    FontAwesome.SortNumericDesc
    FontAwesome.ThumbsUp
    FontAwesome.ThumbsDown
    FontAwesome.YoutubeSquare
    FontAwesome.Youtube
    FontAwesome.Xing
    FontAwesome.XingSquare
    FontAwesome.YoutubePlay
    FontAwesome.Dropbox
    FontAwesome.StackOverflow
    FontAwesome.Instagram
    FontAwesome.Flickr
    FontAwesome.Adn
    FontAwesome.Bitbucket
    FontAwesome.BitbucketSquare
    FontAwesome.Tumblr
    FontAwesome.TumblrSquare
    FontAwesome.LongArrowDown
    FontAwesome.LongArrowUp
    FontAwesome.LongArrowLeft
    FontAwesome.LongArrowRight
    FontAwesome.Apple
    FontAwesome.Windows
    FontAwesome.Android
    FontAwesome.Linux
    FontAwesome.Dribbble
    FontAwesome.Skype
    FontAwesome.Foursquare
    FontAwesome.Trello
    FontAwesome.Female
    FontAwesome.Male
    FontAwesome.Gittip
    FontAwesome.SunO
    FontAwesome.MoonO
    FontAwesome.Archive
    FontAwesome.Bug
    FontAwesome.VK
    FontAwesome.Weibo
    FontAwesome.Renren
    FontAwesome.Pagelines
    FontAwesome.StackExchange
    FontAwesome.ArrowCircleORight
    FontAwesome.ArrowCircleOLeft
    FontAwesome.CaretSquareOLeft
    FontAwesome.DotCircleO
    FontAwesome.Wheelchair
    FontAwesome.VimeoSquare
    FontAwesome.TRY
    FontAwesome.PlusSquareO
  }

}
